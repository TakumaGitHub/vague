/**
 * 改行を入れるjavascriptファイル
 */



$(function(){

	$('.line-break').each(function(index,element){

		//文字列
		var text = $(element).text();

		console.log(text);

		//文字列の長さ
		var textLength =  $(element).text().length;

		//改行する回数
		var breakCount = Math.ceil(textLength / 20);

		//挿入するテキスト
		var insertText = "";

		for(i = 0; i < breakCount; i++){

			if(i == breakCount - 1){

				insertText += text.substr(i*20,20);
				console.log(insertText);

			}else{

				insertText += text.substr(i*20,20) + "<br>";
				console.log(insertText);

			}

		}

		$(element).html(insertText);


	});









});