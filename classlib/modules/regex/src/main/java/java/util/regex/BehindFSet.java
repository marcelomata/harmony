/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

/**
 * @author Nikolay A. Kuznetsov
 */
package java.util.regex;

/**
 * FSet for lookbehind constructs. Checks if string index saved by corresponding
 * jointSet in "consumers" equals to current index and return current string
 * index, return -1 otherwise.
 * 
 * @author Nikolay A. Kuznetsov
 */
class BehindFSet extends FSet {

    public BehindFSet(int groupIndex) {
        super(groupIndex);
    }

    public int matches(int stringIndex, CharSequence testString,
            MatchResultImpl matchResult) {

        int gr = getGroupIndex();
        int rightBound = matchResult.getConsumed(gr);
        return (rightBound == stringIndex) ? stringIndex : -1;
    }

    protected String getName() {
        return "BehindFSet"; //$NON-NLS-1$
    }
}
