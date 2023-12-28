<template>
<!--  html-->

  <div class="app">
      <h1>
          你好啊！
      </h1>
      <Person/>
  </div>
</template>

<script lang="ts">
// js ts
import Person from "./Components/Person.vue";
  export default {
      name : 'App',//组件名
      components:{Person}
  }

</script>


<style>
  /*样式*/
.app{
    background: lightpink;
    box-shadow: 0 0 10px;
    border-radius: 10px;
    padding: 20px;
}
</style>
