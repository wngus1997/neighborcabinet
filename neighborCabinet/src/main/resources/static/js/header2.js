/**
 * header2.js
 */
 
$(document).ready(function(){
	
	if($("input[name='mesCtg']").val() == "1"){
 		$.ajax({
 			type:"post",
 			url:"/message/message",
 			success:function(result){
 				$('#applyDiv').html(result);
 			},
 			error:function(){
 				alert("실패");
 			},
 		});
	}
	
	$("input[name='mesCtg']").change(function(){
		if($(this).val() == "1"){
	 		$.ajax({
	 			type:"post",
	 			url:"/message/message",
	 			success:function(result){
	 				$('#applyDiv').html(result);
	 			},
	 			error:function(){
	 				alert("실패");
	 			},
	 		});
		}
		if($(this).val() == "2"){
	 		$.ajax({
	 			type:"post",
	 			url:"/message/request",
	 			success:function(result){
	 				$('#applyDiv').html(result);
	 			},
	 			error:function(){
	 				alert("실패");
	 			},
	 		});
		}
	});
});