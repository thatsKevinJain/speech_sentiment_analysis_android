# speech_sentiment_analysis_android
Android app which will convert speech into text and then perform a sentiment/classification analysis of the text.

### The generated result will contain 3 paramters - 
- Sentiment Analysis
- Classification of Text
- Duration of the audio recorded

### API's used
- Google Cloud Speech API
- Google Natural Language API

### Open Source Libraries Used
- ButterKnife
- RetroFit
- RoundCornerProgressBar
- MaterialDialog

### Additional Features
- The result will be stored in Firebase Database, which then be viewed in a small webpage inside the folder **Speech Website**
- The audio will be recorded and the text will be displayed synchronously

### Note
> Due to API call limitations, change the API key in URL.java with your Key, or you will have to clear the app data everytime you run the app. 
