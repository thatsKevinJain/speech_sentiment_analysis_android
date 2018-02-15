package com.google.cloud.android.speech.Model;

/**
 * Created by Kevin on 11/02/18.
 */

public class DocumentSentiment {


    /**
     * documentSentiment : {"magnitude":0.9,"score":0.9}
     * language : en
     * sentences : [{"text":{"content":"Enjoy your vacation!","beginOffset":0},"sentiment":{"magnitude":0.9,"score":0.9}}]
     */

    private DocumentSentimentBean documentSentiment;

    public DocumentSentimentBean getDocumentSentiment() {
        return documentSentiment;
    }

    public void setDocumentSentiment(DocumentSentimentBean documentSentiment) {
        this.documentSentiment = documentSentiment;
    }

    public static class DocumentSentimentBean {
        /**
         * magnitude : 0.9
         * score : 0.9
         */

        private double magnitude;
        private double score;

        public double getMagnitude() {
            return magnitude;
        }

        public void setMagnitude(double magnitude) {
            this.magnitude = magnitude;
        }

        public double getScore() {
            return score;
        }

        public void setScore(double score) {
            this.score = score;
        }
    }
}

