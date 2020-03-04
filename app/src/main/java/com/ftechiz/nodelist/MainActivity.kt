package com.ftechiz.nodelist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var node1 = Node(1,null)

        var node2 = Node(2,null)
        var node3 = Node(2,null)


        node1.nxt = node2
        node2.nxt = node3

        Log.d("Mynode",""+node1)

    }
}
