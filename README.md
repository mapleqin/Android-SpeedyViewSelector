# Android-SpeedyViewSelector
This is a change Background Or TextColor Selector support library, with which you can directly specify the Background to be displayed in different states or TextColor Layout xml, such as clicking the button effect, the conventional practice is to create Selector xml file in drawable directory but when the project becomes larger when the file back to the directory Selector cause more and more difficult to maintain and achieve the Library can easily solve these problems, and can also achieve a lot Shape effects can be achieved, if you are using process have any questions or suggestions, please send an email to my email below, thank you!


For more information please see <a href='https://www.mapleqin.org/Android-SpeedyViewSelector'>the website</a>

## Screenshots
![Sample1](https://img.alicdn.com/imgextra/i2/1025192026/TB2tGqiepXXXXXkXpXXXXXXXXXX_!!1025192026.gif)

## Android-SpeedyViewSelector with xml code
```xml
	   <net.soulwolf.widget.speedyselector.widget.SelectorTextView
            xmlns:soulwolf="http://schemas.android.com/apk/res-auto"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:gravity="center"
            android:padding="8dp"
            android:textSize="16sp"
            android:clickable="true"
            android:background="@color/sample_primary"
            android:textColor="@color/sample_primary"
            soulwolf:spStatePressedTextColor="@color/sample_accent"
            soulwolf:spStatePressedBackground="@color/sample_accent"
            soulwolf:spRadius="8dp"
            soulwolf:spJustBorder="true"
            soulwolf:spBorderWidth="1dp"
            android:text="SelectorTextView"/>

        <net.soulwolf.widget.speedyselector.widget.SelectorTextView
            xmlns:soulwolf="http://schemas.android.com/apk/res-auto"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:gravity="center"
            android:padding="8dp"
            android:textSize="16sp"
            android:layout_marginTop="8dp"
            android:clickable="true"
            android:background="@color/sample_primary"
            android:textColor="@color/sample_primary"
            soulwolf:spStatePressedTextColor="@color/sample_accent"
            soulwolf:spStatePressedBackground="@color/sample_accent"
            soulwolf:spRadius="0dp"
            soulwolf:spJustBorder="true"
            soulwolf:spBorderWidth="1dp"
            android:text="SelectorTextView"/>


        <net.soulwolf.widget.speedyselector.widget.SelectorTextView
            xmlns:soulwolf="http://schemas.android.com/apk/res-auto"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:gravity="center"
            android:padding="8dp"
            android:textSize="16sp"
            android:layout_marginTop="8dp"
            android:clickable="true"
            android:background="@color/sample_primary"
            android:textColor="@color/sample_primary"
            soulwolf:spStatePressedTextColor="@color/sample_accent"
            soulwolf:spStatePressedBackground="@color/sample_accent"
            soulwolf:spRadius="360dp"
            soulwolf:spJustBorder="true"
            soulwolf:spBorderWidth="1dp"
            android:text="SelectorTextView"/>

        <net.soulwolf.widget.speedyselector.widget.SelectorFrameLayout
            xmlns:soulwolf="http://schemas.android.com/apk/res-auto"
            android:layout_width="match_parent"
            android:layout_marginTop="8dp"
            android:padding="20dp"
            soulwolf:spStateDefaultBackground="@color/sample_primary"
            soulwolf:spStatePressedBackground="@color/sample_accent"
            soulwolf:spRadius="8dp"
            android:clickable="true"
            android:layout_height="wrap_content"/>

        <net.soulwolf.widget.speedyselector.widget.SelectorFrameLayout
            xmlns:soulwolf="http://schemas.android.com/apk/res-auto"
            android:layout_width="match_parent"
            android:layout_marginTop="8dp"
            android:padding="20dp"
            soulwolf:spStateDefaultBackground="@color/sample_primary"
            soulwolf:spStatePressedBackground="@color/sample_accent"
            soulwolf:spRadius="0dp"
            android:clickable="true"
            android:layout_height="wrap_content"/>

        <net.soulwolf.widget.speedyselector.widget.SelectorFrameLayout
            android:layout_width="match_parent"
            android:layout_marginTop="8dp"
            android:padding="20dp"
            soulwolf:spStateDefaultBackground="@color/sample_primary"
            soulwolf:spStatePressedBackground="@color/sample_accent"
            soulwolf:spRadius="360dp"
            android:clickable="true"
            android:layout_height="wrap_content"/>

        <net.soulwolf.widget.speedyselector.widget.SelectorRelativeLayout
            xmlns:soulwolf="http://schemas.android.com/apk/res-auto"
            android:layout_width="match_parent"
            android:layout_marginTop="8dp"
            android:padding="8dp"
            soulwolf:spStateDefaultBackground="@color/sample_primary"
            soulwolf:spStatePressedBackground="@color/sample_accent"
            soulwolf:spRadius="8dp"
            soulwolf:spJustBorder="true"
            soulwolf:spBorderWidth="1dp"
            android:clickable="true"
            android:layout_height="wrap_content">

            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="SelectorRelativeLayout"
                android:gravity="center"/>

        </net.soulwolf.widget.speedyselector.widget.SelectorRelativeLayout>

        <net.soulwolf.widget.speedyselector.widget.SelectorRelativeLayout
            xmlns:soulwolf="http://schemas.android.com/apk/res-auto"
            android:layout_width="match_parent"
            android:layout_marginTop="8dp"
            android:padding="8dp"
            soulwolf:spStateDefaultBackground="@color/sample_primary"
            soulwolf:spStatePressedBackground="@color/sample_accent"
            soulwolf:spRadius="0dp"
            soulwolf:spJustBorder="true"
            soulwolf:spBorderWidth="1dp"
            android:clickable="true"
            android:layout_height="wrap_content">

            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="SelectorRelativeLayout"
                android:gravity="center"/>

        </net.soulwolf.widget.speedyselector.widget.SelectorRelativeLayout>

        <net.soulwolf.widget.speedyselector.widget.SelectorRelativeLayout
            xmlns:soulwolf="http://schemas.android.com/apk/res-auto"
            android:layout_width="match_parent"
            android:layout_marginTop="8dp"
            android:padding="8dp"
            soulwolf:spStateDefaultBackground="@color/sample_primary"
            soulwolf:spStatePressedBackground="@color/sample_accent"
            soulwolf:spRadius="360dp"
            soulwolf:spJustBorder="true"
            soulwolf:spBorderWidth="1dp"
            android:clickable="true"
            android:layout_height="wrap_content">

            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:text="SelectorRelativeLayout"
                android:gravity="center"/>

        </net.soulwolf.widget.speedyselector.widget.SelectorRelativeLayout>

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="8dp"
            android:gravity="center_horizontal"
            android:orientation="horizontal">

            <net.soulwolf.widget.speedyselector.widget.SelectorLinearLayout
                xmlns:soulwolf="http://schemas.android.com/apk/res-auto"
                android:layout_width="150dp"
                android:layout_height="150dp"
                soulwolf:spStateDefaultBackground="@color/sample_primary"
                soulwolf:spStatePressedBackground="@color/sample_accent"
                soulwolf:spRadius="360dp"
                android:clickable="true"
                android:gravity="center"
                android:padding="8dp"
                soulwolf:spJustBorder="true"
                soulwolf:spBorderWidth="1dp"
                android:orientation="horizontal">

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="SelectorLinearLayout"/>

            </net.soulwolf.widget.speedyselector.widget.SelectorLinearLayout>

            <net.soulwolf.widget.speedyselector.widget.SelectorLinearLayout
                xmlns:soulwolf="http://schemas.android.com/apk/res-auto"
                android:layout_width="150dp"
                android:layout_height="150dp"
                soulwolf:spStateDefaultBackground="@color/sample_primary"
                soulwolf:spStatePressedBackground="@color/sample_accent"
                soulwolf:spRadius="360dp"
                android:padding="8dp"
                android:clickable="true"
                android:layout_marginLeft="20dp"
                android:gravity="center"
                soulwolf:spJustBorder="false"
                soulwolf:spBorderWidth="1dp"
                android:orientation="horizontal">

                <TextView
                    android:layout_width="wrap_content"
                    android:layout_height="wrap_content"
                    android:text="SelectorLinearLayout"/>

            </net.soulwolf.widget.speedyselector.widget.SelectorLinearLayout>

        </LinearLayout>

```

## Android-SpeedyViewSelector with java code
```java
	// BackgroundSelector
	public void addStateBackground(StateType state,Drawable drawable);

    public void addStateBackgroundResource(StateType state,@DrawableRes int draRes);

    public void addStateBackground(StateType state,float radius,@ColorInt int  color);

    public void addStateBackground(StateType state,float radius,boolean justBorder,@ColorInt int color);

    public void addStateBackground(StateType state,float radius,boolean justBorder,float borderWidth,@ColorInt int color);

    public void addStateBackgroundResource(StateType state,float radius,@ColorRes int colorRes);

    public void addStateBackgroundResource(StateType state,float radius,boolean justBorder,@ColorRes int colorRes);

    public void addStateBackgroundResource(StateType state,float radius,boolean justBorder,float borderWidth,@ColorRes int colorRes);

    public void requestSelector();

	// TextColorSelector
	public void setTextColorResource(@ColorRes int resId);

    public void addTextStateColor(StateType state,@ColorInt int color);

    public void addTextStateColorResource(StateType state, @ColorRes int colorRes);

    public void requestSelector();
```

## Attr params  info

<table>
	<tbody>
		<tr>
			<td><b>attrName</b></td>
			<td><b>Explanation</b></td>
		</tr>
		<tr>
			<td>spRadius</td>
			<td>This parameter is used to set the radius of each corner Background! </td>
		</tr>
		<tr>
			<td>spJustBorder</td>
			<td>This parameter indicates whether to draw only border</td>
		</tr>
		<tr>
			<td>spBorderWidth</td>
			<td>This parameter indicates the width of the border</td>
		</tr>
		<tr>
			<td>spStateDefaultBackground<br/>spStateDefaultTextColor</td>
			<td>Background Or TextColor this parameter default to be displayed</td>
		</tr>
		<tr>
			<td>spStateFocusedBackground<br/>spStateFocusedTextColor</td>
			<td>Background Or TextColor this parameter StateFocused to be displayed</td>
		</tr>
		<tr>
			<td>spStateWindowFocusedBackground<br/>spStateWindowFocusedTextColor</td>
			<td>Background Or TextColor this parameter StateWindowFocused to be displayed</td>
		</tr>	
		<tr>
			<td>spStateEnabledBackground<br/>spStateEnabledTextColor</td>
			<td>Background Or TextColor this parameter StateEnabled to be displayed</td>
		</tr>
		<tr>
			<td>spStateCheckedBackground<br/>spStateCheckedTextColor</td>
			<td>Background Or TextColor this parameter StateChecked to be displayed</td>
		</tr>
		<tr>
			<td>spStateSelectedBackground<br/>spStateSelectedTextColor</td>
			<td>Background Or TextColor this parameter StateSelected to be displayed</td>
		</tr>
		<tr>
			<td>spStateActivatedBackground<br/>spStateActivatedTextColor</td>
			<td>Background Or TextColor this parameter StateActivated to be displayed</td>
		</tr>
		<tr>
			<td>spStatePressedBackground<br/>spStatePressedTextColor</td>
			<td>Background Or TextColor this parameter StatePressed to be displayed</td>
		</tr>
		<tr>
			<td>spStateActiveBackground<br/>spStateActiveTextColor</td>
			<td>Background Or TextColor this parameter StateActive to be displayed</td>
		</tr>	
	</tbody>
</table>

## Implementing View!

 <ul>
   	<li><a href='javascript:'>SelectorAbsoluteLayout</a></li>
	<li><a href='javascript:'>SelectorButton</a></li>
	<li><a href='javascript:'>SelectorCheckBox</a></li>
	<li><a href='javascript:'>SelectorEditText</a></li>
	<li><a href='javascript:'>SelectorFrameLayout</a></li>
	<li><a href='javascript:'>SelectorGridLayout</a></li>
	<li><a href='javascript:'>SelectorImageButton</a></li>
	<li><a href='javascript:'>SelectorLinearLayout</a></li>
	<li><a href='javascript:'>SelectorRadioButton</a></li>
	<li><a href='javascript:'>SelectorRadioGroup</a></li>
	<li><a href='javascript:'>SelectorRelativeLayout</a></li>
	<li><a href='javascript:'>SelectorTableLayout</a></li>
	<li><a href='javascript:'>SelectorTextView</a></li>
	<li><a href='javascript:'>SelectorView</a></li>
 </ul>

## Custom
```java
	// Background Selector
	public class SelectorFrameLayout extends FrameLayout implements BackgroundSelector{

	    SpeedySelectorDelegate mSpeedySelectorDelegate;
	
	    public SelectorFrameLayout(Context context) {
	        super(context);
	        mSpeedySelectorDelegate = SpeedySelectorDelegate.obtain(this);
	    }
	
	    public SelectorFrameLayout(Context context, AttributeSet attrs) {
	        super(context, attrs);
	        mSpeedySelectorDelegate = SpeedySelectorDelegate.obtain(this,attrs);
	    }
	
	    public SelectorFrameLayout(Context context, AttributeSet attrs, int defStyleAttr) {
	        super(context, attrs, defStyleAttr);
	        mSpeedySelectorDelegate = SpeedySelectorDelegate.obtain(this,attrs,defStyleAttr);
	    }
	
	    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
	    public SelectorFrameLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
	        super(context, attrs, defStyleAttr, defStyleRes);
	        mSpeedySelectorDelegate = SpeedySelectorDelegate.obtain(this,attrs,defStyleAttr,defStyleRes);
	    }
	
	    @Override
	    public void addStateBackground(StateType state, Drawable drawable) {
	        mSpeedySelectorDelegate.addStateBackground(state,drawable);
	    }
	
	    @Override
	    public void addStateBackgroundResource(StateType state, @DrawableRes int draRes) {
	        mSpeedySelectorDelegate.addStateBackgroundResource(state, draRes);
	    }
	
	    @Override
	    public void addStateBackground(StateType state, float radius, @ColorInt int color) {
	        mSpeedySelectorDelegate.addStateBackground(state,radius,color);
	    }
	
	    @Override
	    public void addStateBackground(StateType state, float radius, boolean justBorder, @ColorInt int color) {
	        mSpeedySelectorDelegate.addStateBackground(state,radius,justBorder,color);
	    }
	
	    @Override
	    public void addStateBackground(StateType state, float radius, boolean justBorder, float borderWidth, @ColorInt int color) {
	        mSpeedySelectorDelegate.addStateBackground(state,radius,justBorder,borderWidth,color);
	    }
	
	    @Override
	    public void addStateBackgroundResource(StateType state, float radius, @ColorRes int colorRes) {
	        mSpeedySelectorDelegate.addStateBackgroundResource(state, radius,colorRes);
	    }
	
	    @Override
	    public void addStateBackgroundResource(StateType state, float radius, boolean justBorder, @ColorRes int colorRes) {
	        mSpeedySelectorDelegate.addStateBackgroundResource(state, radius,justBorder,colorRes);
	    }
	
	    @Override
	    public void addStateBackgroundResource(StateType state, float radius, boolean justBorder, float borderWidth, @ColorRes int colorRes) {
	        mSpeedySelectorDelegate.addStateBackgroundResource(state, radius,justBorder,borderWidth,colorRes);
	    }
	
	    @Override
	    public void requestSelector() {
	        mSpeedySelectorDelegate.requestSelector();
	    }
	}

	// General Selector
	public class SelectorTextView extends TextView implements GeneralSelector{

	    SpeedySelectorDelegate mSpeedySelectorDelegate;
	
	    public SelectorTextView(Context context) {
	        super(context);
	        mSpeedySelectorDelegate = SpeedySelectorDelegate.obtainGeneral(this);
	    }
	
	    public SelectorTextView(Context context, AttributeSet attrs) {
	        super(context, attrs);
	        mSpeedySelectorDelegate = SpeedySelectorDelegate.obtainGeneral(this, attrs);
	    }
	
	    public SelectorTextView(Context context, AttributeSet attrs, int defStyleAttr) {
	        super(context, attrs, defStyleAttr);
	        mSpeedySelectorDelegate = SpeedySelectorDelegate.obtainGeneral(this, attrs, defStyleAttr);
	    }
	
	    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
	    public SelectorTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
	        super(context, attrs, defStyleAttr, defStyleRes);
	        mSpeedySelectorDelegate = SpeedySelectorDelegate.obtainGeneral(this, attrs, defStyleAttr, defStyleRes);
	    }
	
	    @Override
	    public void addStateBackground(StateType state, Drawable drawable) {
	        mSpeedySelectorDelegate.addStateBackground(state,drawable);
	    }
	
	    @Override
	    public void addStateBackgroundResource(StateType state, @DrawableRes int draRes) {
	        mSpeedySelectorDelegate.addStateBackgroundResource(state, draRes);
	    }
	
	    @Override
	    public void addStateBackground(StateType state, float radius, @ColorInt int color) {
	        mSpeedySelectorDelegate.addStateBackground(state,radius,color);
	    }
	
	    @Override
	    public void addStateBackground(StateType state, float radius, boolean justBorder, @ColorInt int color) {
	        mSpeedySelectorDelegate.addStateBackground(state,radius,justBorder,color);
	    }
	
	    @Override
	    public void addStateBackground(StateType state, float radius, boolean justBorder, float borderWidth, @ColorInt int color) {
	        mSpeedySelectorDelegate.addStateBackground(state,radius,justBorder,borderWidth,color);
	    }
	
	    @Override
	    public void addStateBackgroundResource(StateType state, float radius, @ColorRes int colorRes) {
	        mSpeedySelectorDelegate.addStateBackgroundResource(state, radius,colorRes);
	    }
	
	    @Override
	    public void addStateBackgroundResource(StateType state, float radius, boolean justBorder, @ColorRes int colorRes) {
	        mSpeedySelectorDelegate.addStateBackgroundResource(state, radius,justBorder,colorRes);
	    }
	
	    @Override
	    public void addStateBackgroundResource(StateType state, float radius, boolean justBorder, float borderWidth, @ColorRes int colorRes) {
	        mSpeedySelectorDelegate.addStateBackgroundResource(state, radius,justBorder,borderWidth,colorRes);
	    }
	
	    @Override
	    public void setTextColorResource(@ColorRes int resId) {
	        mSpeedySelectorDelegate.setTextColorRessource(resId);
	    }
	
	    @Override
	    public void addTextStateColor(StateType state, @ColorInt int color) {
	        mSpeedySelectorDelegate.addTextStateColor(state,color);
	    }
	
	    @Override
	    public void addTextStateColorResource(StateType state, @ColorRes int colorRes) {
	        mSpeedySelectorDelegate.addTextStateColorRessource(state, colorRes);
	    }
	
	    @Override
	    public void requestSelector() {
	        mSpeedySelectorDelegate.requestSelector();
	    }
	}
```

## Maven
	<dependency>
  	    <groupId>net.soulwolf.widget</groupId>
		<url>https://dl.bintray.com/soulwolf/maven</url>
  	    <artifactId>speedySelector</artifactId>
  	    <version>1.0.0</version>
	</dependency>
## Gradle
	allprojects {
       repositories {
          jcenter()
       }
	}
	
	compile 'net.soulwolf.widget:speedySelector:1.0.0'

## Developed by
 Ching Soulwolf - <a href='javascript:'>Ching.Soulwolf@gmail.com</a>


## License
	Copyright 2015 Soulwolf Ching
	Copyright 2015 The Android Open Source Project for Android-SpeedyViewSelector
	
	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

	    http://www.apache.org/licenses/LICENSE-2.0
	
	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
	
