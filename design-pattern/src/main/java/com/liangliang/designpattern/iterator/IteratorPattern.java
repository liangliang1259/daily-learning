package com.liangliang.designpattern.iterator;

import java.util.*;

/**
 * @Description: TODO
 * @Author: sunliangliang
 * @Date: 2020/7/15
 */
public class IteratorPattern implements Iterator {
    private Map<String,Stock> stocks = new HashMap<>();
    private Iterator<Map.Entry<String,Stock>> iterator = stocks.entrySet().iterator();
    public void add(Stock stock){
        stocks.put(stock.getCode(),stock);
        iterator = stocks.entrySet().iterator();
    }

    @Override
    public boolean hasNext() {
        return iterator.hasNext();
    }

    @Override
    public Object next() {
        return iterator.next().getValue();
    }

    public static void main(String[] args) {
        Stock stock1 = new Stock("JD","京东",242.6,100.2);
        Stock stock2 = new Stock("TX","腾讯",500.2,210.2);
        Stock stock3 = new Stock("BABA","阿里巴巴",480.2,540.8);
        IteratorPattern pattern = new IteratorPattern();
        pattern.add(stock1);
        pattern.add(stock2);
        pattern.add(stock3);

        while (pattern.hasNext()){
            System.out.println(pattern.next().toString());
        }
    }
}
