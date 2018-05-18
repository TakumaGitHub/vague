/**
 *
 */

$(function(){

	maxReviewTitle();
	maxReviewBody();

	var $star =  $('.review-score-star');

	$star.hover(
	function(){

		//何番目の星がhoverされたか
		var index = $star.index(this);

		$star.each(function(i,elem){

			if(index >= i){

				$(elem).attr('src','LogoImage/reviewScore.png');

			}else{

				$(elem).attr('src','LogoImage/reviewScoreGrey.png');

			}

		});

	},
	function(){

		var score = $('#reviewScore').val();

		$star.each(function(i,elem){

			if(score >= i + 1){

				$(elem).attr('src','LogoImage/reviewScore.png');

			}else{

				$(elem).attr('src','LogoImage/reviewScoreGrey.png');

			}

		});

	});


	$star.on('click',function(){

		//何番目の星がclickされたか
		var index = $star.index(this);

		ChangeReviewScore(index + 1);

	});




	function ChangeReviewScore(reviewScore){

		$('#reviewScore').val(reviewScore);

	}


	$('.reviewTitle-form').on('input',function(){

		maxReviewTitle();

	});

	function maxReviewTitle(){

		var reviewTitleLength = 100 - $('.reviewTitle-form').val().length;

		if(reviewTitleLength < 0){

			reviewTitleLength = 0;
		}

		$('.max-reviewTitle').text(reviewTitleLength);

	}

	$('.reviewBody-form').on('input',function(){

		maxReviewBody();

	});

	function maxReviewBody(){

		var reviewBodyLength = 255 - $('.reviewBody-form').val().length;

		if(reviewBodyLength < 0){

			reviewBodyLength = 0;
		}

		$('.max-reviewBody').text(reviewBodyLength);

	}


});