# databinding-basic
###### Step1: 
Enable Databinding in your build.gradle (app)
```
   dataBinding{
      enable = true
   }
```
Make sure you add plugin for 'kotlin-kapt' if you are using kotlin for dataBinding

###### Step2: 
Create your data class or POJO 
```
data class MyDetailsData(var name: String,
                         var emailId: String)
```

###### Step3: 
Create your xml file and add variables in it depending on the data you want to show. Here I have only one pojo, myDetailData
so I am going to add that in my xml file
```
 <data>
        <variable
            name="myDetail"
            type="com.data.mybinding.MyDetailsData"/>
    </data>
```
Refer elements of object in TextView, Edit Text, Button etc, via:
```
 android:text="@{myDetail.emailId}"
```

###### Step4: 
Lastly, we need to add content to this data, You can do this via your Database, user input, or API. But I have just hard coded this myself,
for the demo. Your activity, should look something like this.
```
 val activityMyBinding = DataBindingUtil.setContentView<ActivityMyBinding>(this, R.layout.activity_my)

        val myDetailsData = MyDetailsData(name = "Yashika Katyal",
                emailId = "myemailid@gmail.com")
        activityMyBinding.myDetail = myDetailsData
```

Please note: Your ninding activity class depends on your layout file name. Let's say my layout file was "activity_main" then my binding class
would look be: **ActivityMainBinding**
