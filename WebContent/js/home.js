/**
 *
 */

$(function(){
	$('#Vague-Logo-Outer').animate(
			  {'z-index': 1},//z-indexを0から1に変更する
			  {
			    duration: 3000, //アニメーションの時間
			    //ステップ中の処理
			    //引数num：処理途中の変化している値
			    step: function (num) {
			      //処理途中の値を使ってちょっとずつ回転させる
			      $(this).css({
			        transform: 'rotate(' + (num * 720) + 'deg)'
			      });
			      //デバッグ用にnumを出力
			      $('#box2').html(num);
			    },
			    //完了時の処理
			    //次回のことを考えz-indexを1から0に戻す
			    complete: function () {
			      $('#box1').css('z-index', 0);
			    }
			  }
			);



});