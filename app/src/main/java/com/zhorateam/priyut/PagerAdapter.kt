package com.zhorateam.priyut

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class PagerAdapter (fm: FragmentManager): FragmentPagerAdapter(fm){
    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> {
                AdvertisementFragment()
            }
            1 -> {
                GiveFragment()
            }
            else -> {
                return Closedragment()
            }
        }
    }
    override fun getCount(): Int {
        return 3
    }

    override fun getPageTitle(position: Int): CharSequence {
        return when (position){
            0 -> "Приют"
            1 -> "Отдам"
            else -> {
                return "Закрыто"
            }
        }
    }
}