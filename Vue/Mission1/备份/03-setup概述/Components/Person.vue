<template>
<div class="person">
  <h2>姓名： {{name}}</h2>
  <h2>年龄： {{age}}</h2>
  <button @click = "showTel">查看联系方式 </button>
  <button @click = "changeAge">修改名字 </button>
  <button @click = "changeName">修改年龄 </button>

</div>
</template>

<script>
export default {
    name: "Person",
    setup(){//setup函数中的this是undefined，vue3中弱化this
        //数据，原来是写在data中的，此时的name,age,tel都不是响应式数据
        let name = 'zhangsan'
        let age = 18
        let tel = '13888888888'

        function changeName() {
            console.log(1)
            name = 'lisi'
            console.log(name)
        }
        function changeAge() {
            console.log(2)
            age += 1  //注意这样修改age，页面是不会更新的
            console.log(age) //但age确实被修改了
        }
        function showTel() {
            alert(tel)
        }

        return {name,age,tel,changeName,changeAge,showTel}


    }
}
</script>

<style scoped>
.person{
    background-color: skyblue;
    box-shadow: 0 0 10px;
    border-radius: 10px;
    padding: 20px;
}
button{
    margin: 0 5px;
}
</style>