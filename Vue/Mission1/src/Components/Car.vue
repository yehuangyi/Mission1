<template>
<div>
    <h2>一辆{{car.brand}}车, 价值{{car.price}}万元</h2>
    <button @click = "changePrice">修改骑车的价格 </button>
    <br>
    <ul>
        <li v-for="game in games" :key="game.id">{{game.name}}</li>
    </ul>
    <button @click = "changeGame1Name">修改第一个游戏</button>
    <br>
    <h2>测试：{{obj.a.b.c}}</h2>
    <button @click = "changeCeshi"></button>
</div>
</template>

<script lang="ts" setup name="Car">
  import {reactive} from "vue";

  let car = reactive({brand:'奔驰', price:100})//对象类型的响应式数据
  let games = reactive([
      {id:'game-1' , name:'王者荣耀'},
      {id:'game-2' , name:'原神'},
      {id:'game-3' , name:'LOL'},
      {id:'game-4' , name:'Apex'},
  ])
  let obj = reactive({
      a:{
          b:{
              c:666
          }
      }
  })
  console.log(car)//reactive包裹的对象会变成一个代理对象
  console.log(games)
  function changePrice(){
      car.price += 10
  }

  function changeGame1Name(){
      games[0].name = "hahahaha王者荣耀"
  }

  function changeCeshi(){
      obj.a.b.c +=111
  }
</script>

<style scoped>

</style>