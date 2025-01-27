/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;


public class App {
    public static void main(String[] args) {
        Gson gson = new Gson();
        JsonObject obj = new JsonObject();
        obj.addProperty("key", "value");
        System.out.println(gson.toJson(obj));
    }
}
