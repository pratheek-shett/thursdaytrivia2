package com.example.thursdaytrivia2.datasource

import com.example.thursdaytrivia2.R
import com.example.thursdaytrivia2.datac.Restaurant

class datasource {

    fun loaddata():List<Restaurant>{
        return listOf<Restaurant>(
            Restaurant(R.string.hotel1,R.drawable.istockphoto_1079901206_612x612,R.string.h1desc,R.string.Rating1,240),
            Restaurant(R.string.hotel2,R.drawable.istockphoto_1295387240_612x612,R.string.h2desc,R.string.Rating2,350),
            Restaurant(R.string.hotel3,R.drawable.istockphoto_1163284610_612x612,R.string.h3desc,R.string.Rating3,640),
            Restaurant(R.string.hotel4,R.drawable.istockphoto_1319278000_612x612,R.string.h4desc,R.string.Rating5,740)

        )
    }
}