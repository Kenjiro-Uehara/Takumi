package Test.Kenjiro.Uehara.Takumi;

/**
 * シンプルな匠メソッドオブジェクトの実装です。
 */
public class SimpleTakumiObject implements TakumiObject {
    private String text;

    /**
     * コンストラクタです。
     */
    public SimpleTakumiObject() {
        this("");
    }

    /**
     * コンストラクタです。
     * @param text 保持する文字列の初期値
     */
    public SimpleTakumiObject(String text) {
        this.text = text;
    }

    /**
     * 表示用文字列を返します。
     *
     * @return 表示用文字列
     */
    @Override
    public String displayText() {
        return text;
    }

    /**
     * Set text.
     */
    public void setText(String text) {
        this.text = text;
    }
}
