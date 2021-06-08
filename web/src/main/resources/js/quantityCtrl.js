$(document).ready(function(){

$(".minusButton").on("click", function(e){
e.preventDefault();
menuId=$(this).attr("id");
qtyInput = $("#quantity"+menuId);

newQty = parseInt(qtyInput.val())-1;
if(newQty>0) qtyInput.val(newQty);
});


$(".plusButton").on("click", function(e){
e.preventDefault();
menuId=$(this).attr("id");
qtyInput = $("#quantity"+menuId);
newQty = parseInt(qtyInput.val())+1;
if(newQty<10) qtyInput.val(newQty);
});
});
