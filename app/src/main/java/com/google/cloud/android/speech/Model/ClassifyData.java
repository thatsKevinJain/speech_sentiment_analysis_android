package com.google.cloud.android.speech.Model;

/**
 * Created by Kevin on 11/02/18.
 */

public class ClassifyData {
    /**
     * document : {"type":"PLAIN_TEXT","content":"Google, headquartered in Mountain View, unveiled the new Android     phone at the Consumer Electronic Show.  Sundar Pichai said in his keynote     that users love their new Android phones."}
     */

    private DocumentBean document;

    public ClassifyData(DocumentBean document) {
        this.document = document;
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
         * content : Google, headquartered in Mountain View, unveiled the new Android     phone at the Consumer Electronic Show.  Sundar Pichai said in his keynote     that users love their new Android phones.
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
