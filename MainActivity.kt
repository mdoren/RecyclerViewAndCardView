package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.recyclerview.adapter.MyAdapter
import com.example.recyclerview.model.MyModel

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    lateinit var gridLayoutManager: GridLayoutManager
    lateinit var arrayList: ArrayList<MyModel>
    lateinit var thisAdapter: MyAdapter

    lateinit var staggered: StaggeredGridLayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
// setup what it looks like
        recyclerView = findViewById(R.id.rv1)
        gridLayoutManager = GridLayoutManager(applicationContext, 3,
                            LinearLayoutManager.VERTICAL, false)
        staggered = StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL)
        recyclerView.layoutManager = staggered
        recyclerView.setHasFixedSize(true)

        // all about data
        arrayList = setupData()

        thisAdapter = MyAdapter(applicationContext, arrayList)
        recyclerView.adapter = thisAdapter
    }


    private fun setupData(): ArrayList<MyModel>{
        var items: ArrayList<MyModel> = ArrayList()

        items.add(MyModel(R.drawable.bowser,"Bowser"))
        items.add(MyModel(R.drawable.captainfalcon,"Captain Falcon"))
        items.add(MyModel(R.drawable.donkeykong,"Donkey Kong"))
        items.add(MyModel(R.drawable.drmario,"Dr. Mario"))
        items.add(MyModel(R.drawable.falco,"Falco"))
        items.add(MyModel(R.drawable.fox,"Fox"))
        items.add(MyModel(R.drawable.ganondorf,"Ganondorf"))
        items.add(MyModel(R.drawable.iceclimbers,"Ice Climbers"))
        items.add(MyModel(R.drawable.jigglypuff,"Jigglypuff"))
        items.add(MyModel(R.drawable.kirby,"Kirby"))
        items.add(MyModel(R.drawable.link,"Link"))
        items.add(MyModel(R.drawable.luigi,"Luigi"))
        items.add(MyModel(R.drawable.mario,"Mario"))
        items.add(MyModel(R.drawable.marth,"Marth"))
        items.add(MyModel(R.drawable.mewtwo,"Mewtwo"))
        items.add(MyModel(R.drawable.mrgameandwatch,"Mr. Game & Watch"))
        items.add(MyModel(R.drawable.ness,"Ness"))
        items.add(MyModel(R.drawable.peach,"Peach"))
        items.add(MyModel(R.drawable.pichu,"Pichu"))
        items.add(MyModel(R.drawable.pikachu,"Pikachu"))
        items.add(MyModel(R.drawable.roy,"Roy"))
        items.add(MyModel(R.drawable.samus,"Samus"))
        items.add(MyModel(R.drawable.sheik,"Sheik"))
        items.add(MyModel(R.drawable.yoshi,"Yoshi"))
        items.add(MyModel(R.drawable.younglink,"Young Link"))
        items.add(MyModel(R.drawable.zelda,"Zelda"))
        return items
    }
}
