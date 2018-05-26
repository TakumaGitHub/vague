/**
 *
 */


function deleteConfirm(){

	var ret = confirm("本当に商品を削除しますか？");

	if(!ret){

		return false;

	}

	return true;

}