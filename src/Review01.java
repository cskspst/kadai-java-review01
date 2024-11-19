public class Review01 {
    // 機能 : 商品価格(税抜)に対し"xx円の商品の税込価格yy円（消費税はzz円）です。" の形式で出力する。

    public static void main(String[] args) {
        double zeiritsu = 0.05 ; // 消費税率(パーセントを小数で指定 10%なら0.1)
        // double zeiritsu = 0.08 ; // 軽減税率ならこっち
        int shouhin_zeinuki = 1000 ; // 商品価格(税抜)

        int shouhin_zeikomi ;    // 商品価格(税込)
        int shouhin_shouhizei ;  // 消費税額

        shouhin_shouhizei = tax(zeiritsu, shouhin_zeinuki);
        shouhin_zeikomi = shouhin_zeinuki + shouhin_shouhizei ; // 税込 = 税抜 + 消費税額

        System.out.println(shouhin_zeinuki + "円の商品の税込価格は" + shouhin_zeikomi + "円(消費税は" + shouhin_shouhizei + "円)です。");
    }

    public static int tax(double zeiritsu, int zeinuki) {
        // 機能 : 指定された消費税率と税抜価格から消費税額を返す
        // 引数 : 消費税率, 税抜価格
        // 戻り値 :    消費税額
        int shouhizei = (int) (zeinuki * zeiritsu) ;
        return shouhizei ;
    }

}
