<template>
<div class="person">
<!--    模版里面修改响应式数据不需要.value-->
  <h2>姓名： {{name}}</h2>
  <h2>年龄： {{age}}</h2>
  <button @click = "showTel">查看联系方式 </button>
  <button @click = "changeAge">修改年龄 </button>
  <button @click = "changeName">修改名字 </button>

</div>
</template>



<script lang="ts" setup>
  import {ref} from "vue"; //想让那些数据是响应式的那就要把那个数据抱在ref中

  let name = ref('zhangsan') //被ref包围的数据变成了一个RefImpl的实例对象
  let age = ref(18)
  let tel = '13888888888'


function changeName() {
    console.log(1)
    // setup()里面使用响应式数据需要.value
    name.value = 'lisi'
    console.log(name)
}
function changeAge() {
    console.log(2)
    age.value += 1
    console.log(age)
}
function showTel() {
    alert(tel)
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