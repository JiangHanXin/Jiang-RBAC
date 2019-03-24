$(function() {
	// Waves初始化
	Waves.displayEffect();
	// 输入框获取焦点后出现下划线
	$('.form-control').focus(function() {
		$(this).parent().addClass('fg-toggled');
	}).blur(function() {
		$(this).parent().removeClass('fg-toggled');
	});
});
Checkbix.init();
$(function() {
	// 点击登录按钮
	$('#login-bt').click(function() {
		login();
	});
	// 回车事件
	$('#username, #password').keypress(function (event) {
		if (13 == event.keyCode) {
			login();
		}
	});
});
// 登录
function login() {
	$.ajax({
		type:"get",
		url:"/sso/login",
		dataType:"text",
		contentType :"application/json;charset=utf-8",
		data: {
			username: $('#username').val(),
			password: $('#password').val(),
		},
		success:function(result){
			//解析数据才能获取到
			var data = jQuery.parseJSON(result);
				if(data.loginstatu == "success"){
					alert("登录成功!");
					window.location.href="index";
				}
				if(data.loginstatu == "fail")
				{
					alert("用户名或密码错误!");
					window.location.href="login";
				}
			}
	});
}