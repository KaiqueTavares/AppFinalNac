package com.tavares.kaique.nac_kaique_tavares_rm79173

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by logonrm on 18/05/2018.
 */
data class Torcedor (val nomeTorcedor:String,
            val time:String):Parcelable{
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(nomeTorcedor)
        parcel.writeString(time)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Torcedor> {
        override fun createFromParcel(parcel: Parcel): Torcedor {
            return Torcedor(parcel)
        }

        override fun newArray(size: Int): Array<Torcedor?> {
            return arrayOfNulls(size)
        }
    }

}