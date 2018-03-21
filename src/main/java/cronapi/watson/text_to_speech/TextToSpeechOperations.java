package cronapi.watson.text_to_speech;

import com.ibm.watson.developer_cloud.text_to_speech.v1.TextToSpeech;
import com.ibm.watson.developer_cloud.text_to_speech.v1.model.AudioFormat;
import com.ibm.watson.developer_cloud.text_to_speech.v1.model.CustomTranslation;
import com.ibm.watson.developer_cloud.text_to_speech.v1.model.CustomVoiceModel;
import com.ibm.watson.developer_cloud.text_to_speech.v1.model.Phoneme;
import com.ibm.watson.developer_cloud.text_to_speech.v1.model.Pronunciation;
import com.ibm.watson.developer_cloud.text_to_speech.v1.model.Voice;
import cronapi.CronapiMetaData;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

@CronapiMetaData
public final class TextToSpeechOperations {

  @CronapiMetaData
  public static List<Voice> getVoices(String username, String password, String endPoint,
      Map<String, String> headers) {
    TextToSpeech service = new TextToSpeech();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getVoices().execute();
  }

  @CronapiMetaData
  public static Voice getVoice(String username, String password, String endPoint,
      Map<String, String> headers,
      String voiceName) {
    TextToSpeech service = new TextToSpeech();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getVoice(voiceName).execute();
  }

  @CronapiMetaData
  public static Voice getVoice(String username, String password, String endPoint,
      Map<String, String> headers,
      String voiceName, String customizationId) {
    TextToSpeech service = new TextToSpeech();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getVoice(voiceName, customizationId).execute();
  }

  @CronapiMetaData
  public static Pronunciation getPronunciation(String username, String password, String endPoint,
      Map<String, String> headers,
      String word, Voice voice, Phoneme phoneme) {
    TextToSpeech service = new TextToSpeech();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getPronunciation(word, voice, phoneme).execute();
  }

  @CronapiMetaData
  public static Pronunciation getPronunciation(String username, String password, String endPoint,
      Map<String, String> headers,
      String word, Voice voice, Phoneme phoneme, String customizationId) {
    TextToSpeech service = new TextToSpeech();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getPronunciation(word, voice, phoneme, customizationId).execute();
  }

  @CronapiMetaData
  public static InputStream synthesize(String username, String password, String endPoint,
      Map<String, String> headers,
      String text, Voice voice) {
    TextToSpeech service = new TextToSpeech();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.synthesize(text, voice).execute();
  }

  @CronapiMetaData
  public static InputStream synthesize(String username, String password, String endPoint,
      Map<String, String> headers,
      String text, Voice voice, AudioFormat audioFormat) {
    TextToSpeech service = new TextToSpeech();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.synthesize(text, voice, audioFormat).execute();
  }

  @CronapiMetaData
  public static InputStream synthesize(String username, String password, String endPoint,
      Map<String, String> headers,
      String text, Voice voice, AudioFormat audioFormat, String customizationId) {
    TextToSpeech service = new TextToSpeech();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.synthesize(text, voice, audioFormat, customizationId).execute();
  }

  @CronapiMetaData
  public static List<CustomVoiceModel> getCustomVoiceModels(String username, String password,
      String endPoint, Map<String, String> headers,
      String language) {
    TextToSpeech service = new TextToSpeech();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getCustomVoiceModels(language).execute();
  }

  @CronapiMetaData
  public static CustomVoiceModel getCustomVoiceModel(String username, String password,
      String endPoint, Map<String, String> headers,
      CustomVoiceModel model) {
    TextToSpeech service = new TextToSpeech();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getCustomVoiceModel(model).execute();
  }

  @CronapiMetaData
  public static CustomVoiceModel createCustomVoiceModel(String username, String password,
      String endPoint, Map<String, String> headers,
      String name, String language, String description) {
    TextToSpeech service = new TextToSpeech();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.createCustomVoiceModel(name, language, description).execute();
  }

  @CronapiMetaData
  public static void updateCustomVoiceModel(String username, String password, String endPoint,
      Map<String, String> headers,
      CustomVoiceModel model) {
    TextToSpeech service = new TextToSpeech();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    service.updateCustomVoiceModel(model).execute();
  }

  @CronapiMetaData
  public static void deleteCustomVoiceModel(String username, String password, String endPoint,
      Map<String, String> headers,
      CustomVoiceModel model) {
    TextToSpeech service = new TextToSpeech();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    service.deleteCustomVoiceModel(model).execute();
  }

  @CronapiMetaData
  public static List<CustomTranslation> getWords(String username, String password, String endPoint,
      Map<String, String> headers,
      CustomVoiceModel model) {
    TextToSpeech service = new TextToSpeech();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getWords(model).execute();
  }

  @CronapiMetaData
  public static CustomTranslation getWord(String username, String password, String endPoint,
      Map<String, String> headers,
      CustomVoiceModel model, String word) {
    TextToSpeech service = new TextToSpeech();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    return service.getWord(model, word).execute();
  }

  @CronapiMetaData
  public static void addWords(String username, String password, String endPoint,
      Map<String, String> headers,
      CustomVoiceModel model, CustomTranslation... translations) {
    TextToSpeech service = new TextToSpeech();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    service.addWords(model, translations).execute();
  }

  @CronapiMetaData
  public static void addWord(String username, String password, String endPoint,
      Map<String, String> headers,
      CustomVoiceModel model, CustomTranslation translation) {
    TextToSpeech service = new TextToSpeech();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    service.addWord(model, translation).execute();
  }

  @CronapiMetaData
  public static void deleteWord(String username, String password, String endPoint,
      Map<String, String> headers,
      CustomVoiceModel model, CustomTranslation translation) {
    TextToSpeech service = new TextToSpeech();
    service.setUsernameAndPassword(username, password);
    service.setEndPoint(endPoint);
    service.setDefaultHeaders(headers);

    service.deleteWord(model, translation).execute();
  }
}
