package com.google.cloud.android.speech.Model;

import java.util.List;

/**
 * Created by Kevin on 11/02/18.
 */

public class ClassifyResponse {
    private List<CategoriesBean> categories;

    public ClassifyResponse(List<CategoriesBean> categories) {
        this.categories = categories;
    }

    public List<CategoriesBean> getCategories() {
        return categories;
    }

    public void setCategories(List<CategoriesBean> categories) {
        this.categories = categories;
    }

    public static class CategoriesBean {
        public CategoriesBean(String name, double confidence) {
            this.name = name;
            this.confidence = confidence;
        }

        /**
         * name : /Computers & Electronics
         * confidence : 0.61
         */


        private String name;
        private double confidence;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getConfidence() {
            return confidence;
        }

        public void setConfidence(double confidence) {
            this.confidence = confidence;
        }
    }
}
