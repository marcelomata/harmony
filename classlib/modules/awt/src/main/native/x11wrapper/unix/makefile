# Licensed to the Apache Software Foundation (ASF) under one or more
# contributor license agreements.  See the NOTICE file distributed with
# this work for additional information regarding copyright ownership.
# The ASF licenses this file to You under the Apache License, Version 2.0
# (the "License"); you may not use this file except in compliance with
# the License.  You may obtain a copy of the License at
# 
#     http://www.apache.org/licenses/LICENSE-2.0
# 
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

HY_BIN=$(HY_TARGET)/build/classlib/awt/native/x11wrapper/
include $(HY_TARGET)/hdk/build/make/defines.mk

INCLUDES += -I$(SHARED)common -I/usr/X11R6/include

BUILDFILES = org_apache_harmony_awt_nativebridge_linux_ErrorHandler.o \
  org_apache_harmony_awt_nativebridge_linux_GLX.o \
  org_apache_harmony_awt_nativebridge_linux_X11.o \
  org_apache_harmony_awt_nativebridge_linux_Xft.o

OSLIBS += $(STDCLIBS) $(XLIBS)

DLLNAME=$(DLLPATH)libX11Wrapper$(HY_SHLIB_SUFFIX)
EXPNAME=HYX11WRAPPER_0.1

include $(HY_TARGET)/hdk/build/make/rules.mk
