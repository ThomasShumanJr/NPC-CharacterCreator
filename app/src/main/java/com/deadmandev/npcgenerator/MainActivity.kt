package com.deadmandev.npcgenerator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    val raceList = arrayListOf("Human", "Halfling", "Elf", "Dwarf", "Half-Orc", "Half-Elf", "Tabaxi", "Teifling",
        "Dragonborn", "Aasamar","Triton", "Goliath")
    val perList =
        arrayListOf("Friendly", "Hostile", "Weary", "Intrigued", "Scared", "Threatened", "Enthralled", "Curious", "Lazy")
    val jobList = arrayListOf("City Guard(Middle Class", "Guard Captain (Upper Middle Class)", "Tavern Owner(Upper Middle Class)",
        "Carpenter(Peasant)", "Low Noble(Upper Class)", "Judge(Upper Class)", "Guild Merchant(Upper Class)",
        "Farmer(Peasant)", "Blacksmith(Middle Class)", "High Noble(Upper Class)", "Priest(Lower Class)",
        "Priest(Middle Class)", "Priest(Upper Class)")
    val random = Random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        racebtn.setOnClickListener {
            val randomRace = random.nextInt(raceList.count())
            raceTxt.text = raceList[randomRace]
        }
        addRaceBtn.setOnClickListener {
            val newRace = newRaceTxt.text.toString()
            raceList.add(newRace)
            newRaceTxt.text.clear()
        }
        perBtn.setOnClickListener {
            val randomPer = random.nextInt(perList.count())
            perTxt.text = perList[randomPer]
        }
        addPerBtn.setOnClickListener {
            val newPer = newPerTxt.text.toString()
            perList.add(newPer)
            newPerTxt.text.clear()
        }
        jobbtn.setOnClickListener {
            val randomJob = random.nextInt(jobList.count())
            jobTxt.text = jobList[randomJob]
        }
        addJobBtn.setOnClickListener {
            val newJob = newJobText.text.toString()
            jobList.add(newJob)
            newJobText.text.clear()
        }
        randomBtn.setOnClickListener {
            val randomJob = random.nextInt(jobList.count())
            jobTxt.text = jobList[randomJob]
            val randomPer = random.nextInt(perList.count())
            perTxt.text = perList[randomPer]
            val randomRace = random.nextInt(raceList.count())
            raceTxt.text = raceList[randomRace]
        }
    }
}