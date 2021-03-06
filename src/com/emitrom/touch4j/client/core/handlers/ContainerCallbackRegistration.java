/**************************************************************************
 * ContainerCallbackRegistration.java is part of Touch4j 4.0. Copyright 2012 Emitrom LLC
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 **************************************************************************/
package com.emitrom.touch4j.client.core.handlers;

import com.emitrom.touch4j.client.core.Component;
import com.emitrom.touch4j.client.core.TouchWidget;
import com.google.gwt.core.client.JavaScriptObject;

public class ContainerCallbackRegistration {

    private final Component uiObject;
    private final String actionString;
    private final JavaScriptObject functionJso;

    public ContainerCallbackRegistration(Component uiObject, String actionString, JavaScriptObject jso) {
        this.uiObject = uiObject;
        this.actionString = actionString;
        this.functionJso = jso;
    }

    public TouchWidget getWidget() {
        return uiObject;
    }

    public String getActionString() {
        return actionString;
    }

    public JavaScriptObject getJso() {
        return functionJso;
    }

    public native void unregister() /*-{
		var obj = this.@com.emitrom.touch4j.client.core.handlers.CallbackRegistration::getWidget()();
		var objjso = obj.@com.emitrom.touch4j.client.core.Component::getOrCreateJsObj()();
		var action = this.@com.emitrom.touch4j.client.core.handlers.CallbackRegistration::getActionString()();
		var jso = this.@com.emitrom.touch4j.client.core.handlers.CallbackRegistration::getJso()();
		objjso.removeListener(action, jso);
    }-*/;
}
