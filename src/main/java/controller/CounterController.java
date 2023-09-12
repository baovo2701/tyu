package controller;


import java.util.HashMap;
import java.util.Map;
import view.Main;

import model.CounterModel;

public class CounterController {

    private CounterModel model;

    public CounterController(CounterModel model) {
        this.model = model;
    }

    public void analyzeContent(String content) {
        model.analyze(content);
    }
}