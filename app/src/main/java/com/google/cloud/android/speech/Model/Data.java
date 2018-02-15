package com.google.cloud.android.speech.Model;

/**
 * Created by Kevin on 10/02/18.
 */

public class Data {

    private String encodingType;
    private DocumentBean document;

    public Data(String encodingType, DocumentBean document) {
        this.encodingType = encodingType;
        this.document = document;
    }

    /**
     * encodingType : UTF8
     * document : {"type":"PLAIN_TEXT","content":"Enjoy your vacation!"}
     */


    public String getEncodingType() {
        return encodingType;
    }

    public void setEncodingType(String encodingType) {
        this.encodingType = encodingType;
    }

    public DocumentBean getDocument() {
        return document;
    }

    public void setDocument(DocumentBean document) {
        this.document = document;
    }

    public static class DocumentBean {
        public DocumentBean(String type, String content) {
            this.type = type;
            this.content = content;
        }

        /**
         * type : PLAIN_TEXT
         * content : Enjoy your vacation!
         */


        private String type;
        private String content;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }
}
