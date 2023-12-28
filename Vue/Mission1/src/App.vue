<template>
<!--  html-->

<<<<<<< HEAD
  <div class="app">
      <h1>
          你好啊！
      </h1>
      <Person/>
      <Car/>
  </div>
=======
    <div class="wrapper">
      <HelloWorld msg="You did it!" />
    </div>
  </header>
<!--对方的丰富的-->
  <main>
    <TheWelcome />
  </main>
>>>>>>> a2ba376be112fa4bf1cef9bc320bb1068775860b
</template>

<script lang="ts">
// js ts
import Person from "./Components/Person.vue";
import Car from "@/Components/Car.vue";
  export default {
      name : 'App',//组件名
      components:{Car, Person}
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
