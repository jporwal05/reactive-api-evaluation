package com.evaluation.baeldung.reactiveapi.controller;

import com.evaluation.baeldung.reactiveapi.models.Foo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
public class ReactiveController {

    @GetMapping("/foo")
    public Flux<Foo> getFoo() {
        return Flux.interval(Duration.ofSeconds(1))
                .map(i -> new Foo("foo" + i, i));
    }
}
