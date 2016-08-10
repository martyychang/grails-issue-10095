package com.example.grails3

import grails.rest.RestfulController

class HelloController extends RestfulController {
    static responseFormats = ['json']

    HelloController() {
        super(Hello)
    }

    def index(HelloIndexCommand cmd) {
        respond cmd
    }
}
