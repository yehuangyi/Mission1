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
    //vue2和vue3语法可以共存，vue2可以读取vue3中的东西，vue3不能读vue2

    data(){
      return{
          c:this.name   //data可以用this.来调用setup里面的数据

      }
    },
    setup(){
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