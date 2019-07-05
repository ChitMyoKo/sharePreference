package com.tpm.sharedpreference

import android.content.Context

class MyPreference(context: Context) {
    var sharedPreference = context.getSharedPreferences(PREFERENCE_NAME,Context.MODE_PRIVATE)
    companion object
    {
       const val PREFERENCE_NAME = "my_prefernces"
       const  val PREFERENCE_USER_NAME = "name"
       const val PREFERENCE_PHONE = "phone_number"

        private var  instance : MyPreference? = null
        fun newInstance(context: Context):MyPreference
        {
            if(instance == null)
            {
                instance = MyPreference(context)
            }
            return instance as MyPreference
        }
    }
    fun saveData(userName: String, phoneNumber :  String)
    {
        sharedPreference.edit().putString(PREFERENCE_USER_NAME,userName).apply()
        sharedPreference.edit().putString(PREFERENCE_PHONE,phoneNumber).apply()
    }
    fun getUserName():String? =  sharedPreference.getString(PREFERENCE_USER_NAME,null)
    fun getPhoneNumber() : String? = sharedPreference.getString(PREFERENCE_PHONE,null)
}