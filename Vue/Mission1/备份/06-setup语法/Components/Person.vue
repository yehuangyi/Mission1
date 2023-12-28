<template>
<div class="person">
  <h2>姓名： {{name}}</h2>
  <h2>年龄： {{age}}</h2>
  <button @click = "showTel">查看联系方式 </button>
  <button @click = "changeAge">修改名字 </button>
  <button @click = "changeName">修改年龄 </button>

</div>
</template>



<script lang="ts" setup name="Person123">
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
    age += 1
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