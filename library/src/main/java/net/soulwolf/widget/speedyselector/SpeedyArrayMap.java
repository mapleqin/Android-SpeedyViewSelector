/**
 * <pre>
 * Copyright 2015 Soulwolf Ching
 * Copyright 2015 The Android Open Source Project for Android-SpeedyViewSelector
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </pre>
 */
package net.soulwolf.widget.speedyselector;

import android.util.SparseArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * author: Soulwolf Created on 2015/8/9 14:34.
 * email : Ching.Soulwolf@gmail.com
 */
final class SpeedyArrayMap<KEY,VALUE> {

    final ArrayList<KEY> mKeyList;

    final ArrayList<VALUE> mValueList;

    SpeedyArrayMap(){
        this.mKeyList = new ArrayList<KEY>();
        this.mValueList = new ArrayList<VALUE>();
    }

    public void clear(){
        this.mKeyList.clear();
        this.mValueList.clear();
    }

    public void putFirst(KEY key,VALUE value){
        put(0, key, value);
    }

    public void put(KEY key,VALUE value){
        this.mKeyList.add(key);
        this.mValueList.add(value);
    }

    public void put(int index,KEY key,VALUE value){
        this.mKeyList.add(index, key);
        this.mValueList.add(index, value);
    }

    public void putAll(SpeedyArrayMap<? extends KEY,? extends VALUE> collections){
        if(collections == null){
            throw new NullPointerException("collections == null");
        }
        this.mKeyList.addAll(collections.keys());
        this.mValueList.addAll(collections.values());
    }

    public void putAll(int index,SpeedyArrayMap<? extends KEY,? extends VALUE> collections){
        if(collections == null){
            throw new NullPointerException("collections == null");
        }
        this.mKeyList.addAll(index, collections.keys());
        this.mValueList.addAll(index, collections.values());
    }

    public void remove(KEY key){
        int index = mKeyList.indexOf(key);
        remove(index);
    }

    public void removeLast(){
        int size = size();
        if(size > 0){
            mKeyList.remove(size - 1);
            mKeyList.remove(size - 1);
        }
    }

    public void remove(int index){
        if(index != -1){
            mKeyList.remove(index);
            mValueList.remove(index);
        }
    }

    public KEY keyAt(int index){
        return mKeyList.get(index);
    }

    public VALUE valueAt(int index){
        return mValueList.get(index);
    }

    public VALUE get(KEY key){
        int index = mKeyList.indexOf(key);
        if(index != -1){
            return mValueList.get(index);
        }
        return null;
    }

    public Collection<KEY> keys(){
        return mKeyList;
    }

    public Collection<VALUE> values(){
        return mValueList;
    }

    public int size(){
        int keySize = mKeyList.size();
        int valueSize = mValueList.size();
        if(keySize != valueSize){
            throw new IllegalStateException("keySize != valueSize");
        }
        return keySize;
    }

    public Collection<Entry<KEY,VALUE>> entryList(){
        int size = size();
        List<Entry<KEY,VALUE>> entryList = new ArrayList<Entry<KEY,VALUE>>(size);
        for (int i=0;i<size;i++){
            entryList.add(new Entry<KEY, VALUE>(mKeyList.get(i),mValueList.get(i)));
        }
        return entryList;
    }

    public static class Entry<KEY,VALUE>{

        final KEY key;
        final VALUE value;

        Entry(KEY key,VALUE value){
            this.key = key;
            this.value = value;
        }

        public KEY getKey() {
            return key;
        }

        public VALUE getValue() {
            return value;
        }
    }

    public SpeedyArrayMap<KEY,VALUE> copy(){
        SpeedyArrayMap<KEY,VALUE> copy = new SpeedyArrayMap<KEY,VALUE>();
        copy.putAll(this);
        return copy;
    }
}
