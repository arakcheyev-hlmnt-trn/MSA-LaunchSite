package com.graph.simplewallet.web.controllers

import net.minidev.json.JSONObject
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

@Controller
class GatemanConrtoller {

    @GetMapping("/hello")
    @ResponseBody
    fun greetStranger(): JSONObject {
        val json = JSONObject()
        json["answer"] = "Hello World!"
        return json
    }
}