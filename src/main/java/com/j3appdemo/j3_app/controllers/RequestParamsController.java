package com.j3appdemo.j3_app.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.j3appdemo.j3_app.models.dto.ParamsDto;


@RestController
@RequestMapping("api/params")
public class RequestParamsController {
@GetMapping("/foo")
public ParamsDto foot(@RequestParam(required = false, defaultValue = "Hola Mundo") String message) {
ParamsDto param = new ParamsDto();
param.setMessage(message);
return param;
}
}
