package com.example.layoutmanagers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.layoutmanagers.adapter.StoryAdapter
import com.example.layoutmanagers.model.Story

class MainActivity : AppCompatActivity() {
    lateinit var list: ArrayList<Story>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }
    private fun initViews() {
        loadList()
        val rvStory=findViewById<RecyclerView>(R.id.rv_story)
        rvStory.adapter=StoryAdapter(list)
        val layoutManager=LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        val layoutManager1=GridLayoutManager(this,2)
        val layoutManager2=StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL)
        rvStory.layoutManager=layoutManager1
    }
    private fun loadList(){
        list=  ArrayList()
        list.add(Story(R.drawable.img5, name = "Qish",))
        list.add(Story(R.drawable.img2,name = "Oyla",))
        list.add(Story(R.drawable.img1,name = "Oyla",))
        list.add(Story(R.drawable.img5, name = "Qish",))
        list.add(Story(R.drawable.img5, name = "Qish",))
        list.add(Story(R.drawable.img2,name = "Oyla",))
        list.add(Story(R.drawable.img1,name = "Oyla",))
        list.add(Story(R.drawable.img5, name = "Qish",))
        list.add(Story(R.drawable.img5, name = "Qish",))
        list.add(Story(R.drawable.img2,name = "Oyla",))
        list.add(Story(R.drawable.img1,name = "Oyla",))
        list.add(Story(R.drawable.img5, name = "Qish",))
        list.add(Story(R.drawable.img5, name = "Qish",))
        list.add(Story(R.drawable.img2,name = "Oyla",))
        list.add(Story(R.drawable.img1,name = "Oyla",))
        list.add(Story(R.drawable.img5, name = "Qish",))
        list.add(Story(R.drawable.img5, name = "Qish",))
        list.add(Story(R.drawable.img2,name = "Oyla",))
        list.add(Story(R.drawable.img1,name = "Oyla",))
        list.add(Story(R.drawable.img5, name = "Qish",))
        list.add(Story(R.drawable.img5, name = "Qish",))
        list.add(Story(R.drawable.img2,name = "Oyla",))
        list.add(Story(R.drawable.img1,name = "Oyla",))
        list.add(Story(R.drawable.img5, name = "Qish",))
        list.add(Story(R.drawable.img5, name = "Qish",))
        list.add(Story(R.drawable.img2,name = "Oyla",))
        list.add(Story(R.drawable.img1,name = "Oyla",))
        list.add(Story(R.drawable.img5, name = "Qish",))
        list.add(Story(R.drawable.img5, name = "Qish",))
        list.add(Story(R.drawable.img2,name = "Oyla",))
        list.add(Story(R.drawable.img1,name = "Oyla",))
        list.add(Story(R.drawable.img5, name = "Qish",))





    }
}