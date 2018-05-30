/**
 *
 */

$(function(){


	$('.totalPrice').each(function(i,elem){

		var insertDate = $(elem).attr('data-date');

		var totalPrice = parseInt($(elem).text());

		$('.addPrice').each(function(index,element){


			if(insertDate == $(element).attr('data-date')){

				totalPrice += parseInt($(element).text());

			}

		});


		$(elem).text(totalPrice);


	});


	$('.comma-price').each(function(index,element){

		var price = $(element).text();

		var priceLength = $(element).text().length;

		var commaCount = Math.floor(priceLength / 3);

		var remainder = priceLength % 3;

		var priceArray = [];

		var finalPrice = "";


		for(i = 0; i < commaCount ; i++){

			var subPrice =  price.substr(-3*(i+1),3);

			priceArray.unshift(subPrice);

		}

		if(remainder != 0){

			var subPrice =  price.substr(0,remainder);

			priceArray.unshift(subPrice);

		}

		for(i = 0; i < priceArray.length; i++){

			if(i == priceArray.length -1){

				finalPrice += priceArray[i];

			}else{

				finalPrice += priceArray[i] + ",";

			}

		}


		$(element).text(finalPrice);



	});
});