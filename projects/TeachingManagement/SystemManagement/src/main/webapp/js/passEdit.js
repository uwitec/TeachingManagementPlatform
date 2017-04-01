﻿$(function () {
    //定义变量接受行内容
    var rowValue;
    $('#dg').datagrid({
        onDblClickCell: function (index, field, value) {
            $('#w').window('open');

        },
        onSelect: function (rowIndex, rowData) {
            rowValue = rowData;
        }
    });

    var pager = $('#dg').datagrid().datagrid('getPager'); // get the pager of datagrid

    $("#editStu").click(function () {

        var selects = $("#dg").datagrid("getSelections");
        if (selects.length == 0) {
            $.messager.alert('警告', '请选择一个需要修改的列');
            return;
        }
        if (selects.length > 1) {
            $.messager.alert('警告', '请勿选择多个');

        }

        else {
            $('#w').window({
                title: "密码修改"
            });
            $("#w").window('open');
            var selectRow = selects[0];

        }
    });

    $("#search").click(function () {
        var no = $("#noSearch").val();
        $('#dg').datagrid('load', {
            'no': no
        });
    });


});

function submitForm() {
    $.messager.progress(); // 显示进度条
    $('#ff').form('submit', {
        url: "/asada",
        onSubmit: function () {
            var isValid = $(this).form('validate');
            if (!isValid) {
                $.messager.progress('close'); // 如果表单是无效的则隐藏进度条
            }
            return isValid; // 返回false终止表单提交
        },
        success: function () {
            $.messager.progress("close"); // 如果提交成功则隐藏进度条
            $("#w").window("close")
        }
    });

}

function cancel() {
    $("#w").window("close");
}
		