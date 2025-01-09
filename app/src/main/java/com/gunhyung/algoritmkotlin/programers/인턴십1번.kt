package com.gunhyung.algoritmkotlin.programers

class `인턴십1번` {
    fun solution(friends: Array<String>, gifts: Array<String>): Int {
        val giftsGiven = HashMap<String, Int>().withDefault { 0 }
        val giftsReceived = HashMap<String, Int>().withDefault { 0 }
        val directGifts = HashMap<Pair<String, String>, Int>().withDefault { 0 }

        gifts.forEach { gift ->
            val (giver, receiver) = gift.split(" ")
            giftsGiven[giver] = giftsGiven.getValue(giver) + 1
            giftsReceived[receiver] = giftsReceived.getValue(receiver) + 1
            directGifts[giver to receiver] = directGifts.getValue(giver to receiver) + 1
        }

        val giftIndex = friends.associateWith { friend ->
            giftsGiven.getValue(friend) - giftsReceived.getValue(friend)
        }

        val giftsNextMonth = HashMap<String, Int>().withDefault { 0 }
        friends.forEach { giver ->
            friends.forEach { receiver ->
                if (giver != receiver) {
                    val directGiftCount = directGifts.getValue(giver to receiver)
                    val reverseGiftCount = directGifts.getValue(receiver to giver)

                    if (directGiftCount > reverseGiftCount) {
                        giftsNextMonth[giver] = giftsNextMonth.getValue(giver) + 1
                    } else if (directGiftCount == reverseGiftCount && giftIndex[giver]!! > giftIndex[receiver]!!) {
                        giftsNextMonth[giver] = giftsNextMonth.getValue(giver) + 1
                    }
                }
            }
        }

        return giftsNextMonth.values.maxOrNull() ?: 0
    }
}
