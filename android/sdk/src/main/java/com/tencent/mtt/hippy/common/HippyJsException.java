/* Tencent is pleased to support the open source community by making Hippy available.
 * Copyright (C) 2018 THL A29 Limited, a Tencent company. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencent.mtt.hippy.common;

/**
 * Created by leonardgong on 2017/11/17 0017.
 */

public class HippyJsException extends Exception
{
	private final String	mStack;
	private String[]		mStackTrace;

	public HippyJsException(String message, String stack)
	{
		super(message);
		mStack = stack;
	}

	public String getStack()
	{
		return mStack;
	}
}
