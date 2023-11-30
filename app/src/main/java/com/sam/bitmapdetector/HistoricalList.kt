package com.sam.bitmapdetector

import android.util.Log
import java.util.LinkedList

/**
 * Created by dongSen on 2023/11/30
 */
class HistoricalList {

    private val list = LinkedList<Effect>()
    private var current = Effect(-2, "system")

    init {
        list.add(Effect(1, "音效 1"))
        list.add(Effect(2, "音效 2"))
        list.add(Effect(3, "音效 3"))
    }

    fun select(item: Effect) {
        current = item
        val itemInList = contains(item)
        if (itemInList != null) {
            itemInList.clickTime = System.currentTimeMillis()
        } else {
            removeLast()
            list.add(item)
        }
        print()
    }

    private fun contains(item: Effect): Effect? {
        return list.find { it.id == item.id }
    }

    private fun removeLast() {
        list.remove(getLast())
    }

    private fun getLast(): Effect {
        return list.minByOrNull { it.clickTime }!!
    }

    private fun print() {
        val stringBuilder = StringBuilder()
        val sortedBy = list.sortedByDescending { it.clickTime }
        sortedBy.forEach {
            stringBuilder.append(it.id).append(" ")
        }
        Log.e("SamTest", "list = $stringBuilder")
        Log.e("SamTest", "select = $current")
    }


}