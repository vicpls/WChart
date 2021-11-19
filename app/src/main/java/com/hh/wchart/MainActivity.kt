package com.hh.wchart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.db.williamchart.data.DataPoint
import com.db.williamchart.view.LineChartView

/**
 *  Test of William chart.
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dp = mutableListOf<DataPoint>()

        dp.add(DataPoint("A", 10f, 10f, 10f))
        dp.add(DataPoint("B", 25f, 20f, 20f))
        dp.add(DataPoint("C", 50f, 50f, 30f))
        dp.add(DataPoint("D", 25f, 25f, 40f))
        dp.add(DataPoint("E", 10f, 10f, 50f))

        val lChartV = findViewById<LineChartView>(R.id.lChartW)

        lChartV.drawLine(dp)

    }
}