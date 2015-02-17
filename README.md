    
Update: This project has been deprecated. The newest swipeRefreshLayout from Google uses the new Material Design & does not need this workaround.
    
Forked from https://github.com/akash-rayate/abRc-Gmail_like_progressbar 
    
Info from the original repo:
    
     abRc-Gmail-like-progressbar
     ===========================

     Progress Bar, called as ButteryProgressBar by Google used in Gmail application.

     Recently with release of Android 4.4 a.k.a. Android Kit-Kat. They reused lots of code from Gmail to make default email      client application. While going through android source code, found this very interesting class, ButteryProgressBar.java      that can be reused to show progress bar in Gmail application.

    Original Source can be found here     https://android.googlesource.com/platform/packages/apps/UnifiedEmail/+/kitkQ-release/src/com/android/mail/ui/ButteryProgressBar.java

    This class can be used in Android 3.0 and above without any code change, as this custom progress bar uses value      animator, which is introduced in Android 3.0.

    To use this progress bar with Android 2.x project's, use 'jake wharton nine old androids library+IBk- (https://github.com/JakeWharton/NineOldAndroids) to replace Android value animator.
  


I modfied the code to add SwipeRefreshLayout and a message of "Pull Down To Refresh" to the code.
Screenshots: https://github.com/pauldmps/Gmail-like-Pull-Down-to-Refresh/wiki/Screenshots

I was not able to implement Gmail-like "Swipe to refresh" message being displyed on the action bar itself. If you can implement it using short amount of code, send a pull request.

    Usage:
    
    Requires API Level 14 (Android 4.0 Ice Cream Sandwich) or later.
    Requires Android.Support.v4 & Android.Support.v7.AppCompat libraries to be referenced in the project.
    
    The MainActivity.java contains the bare minimum code required to implement this. Tweak as necessary.
    Do not modify the ButteryProgressBar.java or SwipeRefreshHintLayout.java.
    
    You need colors.xml & attrs.xml in your project. Also the layout of your activity must contain the following:
    
      <com.pauldmps.GmailLikePullDownToRefresh.SwipeRefreshHintLayout
        android:id="@+id/swipe_hint"
        android:layout_width="match_parent"
        android:layout_height="0dp">
        
        <TextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_centerInParent="true"
            android:text="Swipe Down To Refresh"/>

        <!-- Any other view positioned using RelativeLayout rules -->

    </com.pauldmps.GmailLikePullDownToRefresh.SwipeRefreshHintLayout>
    
    In the above code, replace the package name to your project, if necessary.
    Also put your listView inside :
        
        <android.support.v4.widget.SwipeRefreshLayout
        android:id="@+id/swipe_container"
        android:layout_width="match_parent"
        android:layout_height="match_parent">
 
        </android.support.v4.widget.SwipeRefreshLayout>
    tags.
    
   Get an instance of the ButteryProgressBar by calling:
        ButteryProgressBar progressBar = ButteryProgressBar.getInstance(YourActivity.this);  
    
    Do not call the constructor of ButteryProgressBar class. 
        
    To start the animation, call the object to ButteryProgressBar.java that you implement as:
         
         progressBar.setVisibility(View.VISIBLE);
         
    Similarly, to stop the animation, call 
         progressBar.setVisibility(View.INVISIBLE);
         


License:
     
     Copyright Android Open Source Project.

     Licensed under the Apache License, Version 2.0 (the "License");
     you may not use this file except in compliance with the License.
     You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

     Unless required by applicable law or agreed to in writing, software
     distributed under the License is distributed on an "AS IS" BASIS,
     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     See the License for the specific language governing permissions and
     limitations under the License.
