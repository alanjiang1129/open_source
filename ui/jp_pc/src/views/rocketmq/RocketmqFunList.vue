<template>
  <div>
    <Card>
      <p slot="title">
        <Icon type="ios-film-outline"></Icon>
        Classic film
      </p>
      <a href="#" slot="extra" @click.prevent="changeLimit">
        <Icon type="ios-loop-strong"></Icon>
        Change
      </a>
      <img src="http://element-cn.eleme.io/static/hamburger.50e4091.png"/>
      <div style="padding: 14px;">
        <span>好吃的汉堡</span>
        <div class="bottom clearfix">
          <time class="time">{{ currentDate }}</time>
          <el-button type="text" class="button">操作按钮</el-button>
        </div>
      </div>
    </Card>

    <Card title="Options" icon="ios-options">
      <CellGroup>
        <Cell title="Only show titles"/>
        <Cell title="Display label content" label="label content"/>
        <Cell title="Display right content" extra="details"/>
        <Cell title="Link" extra="details" to="/components/button"/>
        <Cell title="Open link in new window" to="/components/button" target="_blank"/>
        <Cell title="Disabled" disabled/>
        <Cell title="Selected" selected/>
        <Cell title="With Badge" to="/components/badge">
          <Badge :count="10" slot="extra"/>
        </Cell>
        <Cell title="With Switch">
          <i-switch v-model="switchValue" slot="extra"/>
        </Cell>
      </CellGroup>
    </Card>

  </div>
</template>

<script>
  export default {
    name: 'RocketmqFunList',
    data () {
      return {
        movieList: [
          {
            name: 'The Shawshank Redemption',
            url: 'https://movie.douban.com/subject/1292052/',
            rate: 9.6
          },
          {
            name: 'Leon:The Professional',
            url: 'https://movie.douban.com/subject/1295644/',
            rate: 9.4
          },
          {
            name: 'Farewell to My Concubine',
            url: 'https://movie.douban.com/subject/1291546/',
            rate: 9.5
          },
          {
            name: 'Forrest Gump',
            url: 'https://movie.douban.com/subject/1292720/',
            rate: 9.4
          },
          {
            name: 'Life Is Beautiful',
            url: 'https://movie.douban.com/subject/1292063/',
            rate: 9.5
          },
          {
            name: 'Spirited Away',
            url: 'https://movie.douban.com/subject/1291561/',
            rate: 9.2
          },
          {
            name: 'Schindler\'s List',
            url: 'https://movie.douban.com/subject/1295124/',
            rate: 9.4
          },
          {
            name: 'The Legend of 1900',
            url: 'https://movie.douban.com/subject/1292001/',
            rate: 9.2
          },
          {
            name: 'WALL·E',
            url: 'https://movie.douban.com/subject/2131459/',
            rate: 9.3
          },
          {
            name: 'Inception',
            url: 'https://movie.douban.com/subject/3541415/',
            rate: 9.2
          }
        ],
        randomMovieList: [],
        switchValue: true
      }
    },
    methods: {}
  }
</script>

<style scoped>
  .time {
    font-size: 13px;
    color: #999;
  }

  .bottom {
    margin-top: 13px;
    line-height: 12px;
  }

  .button {
    padding: 0;
    float: right;
  }

  .image {
    width: 100%;
    display: block;
  }

  .clearfix:before,
  .clearfix:after {
    display: table;
    content: "";
  }

  .clearfix:after {
    clear: both
  }

  .ivu-card-bordered {
    width: 25%;
    margin: 50px;
  }
</style>
