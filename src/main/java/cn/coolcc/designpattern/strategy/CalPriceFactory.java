package cn.coolcc.designPatterns.strategy;

import cn.coolcc.designPatterns.strategy.annotations.OnceValidRegion;
import cn.coolcc.designPatterns.strategy.annotations.TotalValidRegion;

import java.io.File;
import java.lang.annotation.Annotation;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Created by chencheng on 17/1/8.
 */
public class CalPriceFactory {

    private static final String CAL_PRICE_PACKAGE = "cc.javasource.designPatterns.strategy.strategys";

    private ClassLoader classLoader = getClass().getClassLoader();

    private List<Class<? extends CalPrice>> calPriceList;


    public CalPrice getCalPrice(Customer customer) {
        SortedMap<Integer, CalPrice> map = new TreeMap<>();

        for (Class<? extends CalPrice> clazz : calPriceList) {
            Annotation[] annotations = clazz.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation instanceof OnceValidRegion) {
                    OnceValidRegion oneRegion = (OnceValidRegion) annotation;
                    if (customer.getAmount() >= oneRegion.value().min() && customer.getAmount() < oneRegion.value().max()) {
                        try {
                            map.put(oneRegion.value().order(), clazz.newInstance());
                        } catch (InstantiationException | IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                } else if (annotation instanceof TotalValidRegion) {
                    TotalValidRegion totalRegion = (TotalValidRegion) annotation;
                    if (customer.getTotalAmount() >= totalRegion.value().min() && customer.getTotalAmount() < totalRegion.value().max()) {
                        try {
                            map.put(totalRegion.value().order(), clazz.newInstance());
                        } catch (InstantiationException | IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }

        return new ProxyCalPrice(map);
    }

    private void init() {
        calPriceList = new ArrayList<>();
        File[] files = getAllCalPrice();

        if (null != files) {
            for (File file : files) {
                try {
                    Class<?> clazz = classLoader.loadClass(CAL_PRICE_PACKAGE + "." + file.getName().replace(".class", ""));
                    if (CalPrice.class.isAssignableFrom(clazz)) {
                        calPriceList.add((Class<? extends CalPrice>) clazz);
                    }
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private File[] getAllCalPrice() {
        try {
            File file = new File(classLoader.getResource(CAL_PRICE_PACKAGE.replace(".", "/")).toURI());
            return file.listFiles(pathname -> {
                return pathname.getName().endsWith(".class");
            });
        } catch (URISyntaxException e) {
            e.printStackTrace();
            System.out.println("扫描包失败了");
            return null;
        }
    }

    private CalPriceFactory() {
        init();
    }

    public static CalPriceFactory getInstance() {
        return Single.instance;
    }

    private static class Single {
        public static CalPriceFactory instance = new CalPriceFactory();
    }
}
