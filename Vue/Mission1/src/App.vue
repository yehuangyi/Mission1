<template>
  <div id="app">
    <router-view></router-view>
  </div>
</template>

<script lang="ts">
import Login from "@/Components/Login.vue";
  export default {
      components:{Login,
  },
};
</script>


<style>
  /*样式*/
/*.app{
    background: lightpink;
    box-shadow: 0 0 10px;
    border-radius: 10px;
    padding: 20px;
}*/

</style>
