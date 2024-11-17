
public class Revie01 {
    // 機能 : 商品価格(税抜)に対し"xx円の商品の税込価格yy円（消費税はzz円）です。" の形式で出力する。

    public static void main(String[] args) {
        int shouhin_zeinuki = 1521 ; // 商品価格(税抜)
        int shouhin_zeikomi ;    // 商品価格(税込)
        int shouhin_shouhizei ;  // 消費税額

        shouhin_shouhizei = tax(shouhin_zeinuki);
        shouhin_zeikomi = shouhin_zeinuki + shouhin_shouhizei ; // 税込 = 税抜 + 消費税額

        System.out.println(shouhin_zeinuki + "円の商品の税込価格は" + shouhin_zeikomi + "円(消費税は" + shouhin_shouhizei + "円)です。");
    }

    public static int tax(int zeinuki) {
        // 引数   : 税抜価格
        // 戻り値  : 消費税額
        int zeiritsu = 10 ;   // 消費税率(パーセント値をそのまま指定する。例:10%の場合10)
        int shouhizei = zeinuki / zeiritsu ;
        return shouhizei ;
    }

}
